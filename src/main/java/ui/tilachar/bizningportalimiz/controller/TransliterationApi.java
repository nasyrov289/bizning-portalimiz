package ui.tilachar.bizningportalimiz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ui.tilachar.bizningportalimiz.dto.TranslitMessage;
import ui.tilachar.bizningportalimiz.dto.TranslitResponse;
import ui.tilachar.bizningportalimiz.service.TranslitService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/translit")
public class TransliterationApi {

    private final TranslitService translitService;

    @PostMapping
    public ResponseEntity<TranslitResponse> translit(@RequestBody TranslitMessage translitMessage) {
        return ResponseEntity.ok(translitService.translitResponse(translitMessage));
    }
}
