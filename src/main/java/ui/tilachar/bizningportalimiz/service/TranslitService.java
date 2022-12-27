package ui.tilachar.bizningportalimiz.service;

import org.springframework.stereotype.Service;
import ui.tilachar.bizningportalimiz.constant.Languages;
import ui.tilachar.bizningportalimiz.dto.TranslitMessage;
import ui.tilachar.bizningportalimiz.dto.TranslitResponse;
import ui.tilachar.bizningportalimiz.utils.TranslitUtils;

@Service
public class TranslitService {

    public TranslitResponse translitResponse(TranslitMessage translitMessage) {

        String text = translitMessage.getText();
        Languages target = translitMessage.getTarget();
        Languages source = translitMessage.getSource();

        TranslitResponse translitResponse = new TranslitResponse();

        if (source.equals(Languages.ui_lat) && target.equals(Languages.ui_cyr)) {
            return translitResponse.setTranslitedText(TranslitUtils.TranslitLatCyr(text));
        }
        if (source.equals(Languages.ui_lat) && target.equals(Languages.ui_arb)) {
            return translitResponse.setTranslitedText(TranslitUtils.TranslitLatArab(text));
        }
        if (source.equals(Languages.ui_cyr) && target.equals(Languages.ui_lat)) {
            return translitResponse.setTranslitedText(TranslitUtils.TranslitCyrLat(text));
        }
        if (source.equals(Languages.ui_cyr) && target.equals(Languages.ui_arb)) {
            return translitResponse.setTranslitedText(TranslitUtils.TranslitCyrArab(text));
        }
        if (source.equals(Languages.ui_arb) && target.equals(Languages.ui_cyr)) {
            return translitResponse.setTranslitedText(TranslitUtils.TranslitArabCyr(text));
        }
        if (source.equals(Languages.ui_arb) && target.equals(Languages.ui_lat)) {
            return translitResponse.setTranslitedText(TranslitUtils.TranslitArabLat(text));
        }
        return translitResponse;
    }
}
