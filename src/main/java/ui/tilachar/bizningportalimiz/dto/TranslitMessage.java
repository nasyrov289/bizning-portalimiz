package ui.tilachar.bizningportalimiz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import ui.tilachar.bizningportalimiz.constant.Languages;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@Accessors(chain = true)
@FieldDefaults(level = PRIVATE)
public class TranslitMessage {

    String text;

    Languages source;

    Languages target;
}
