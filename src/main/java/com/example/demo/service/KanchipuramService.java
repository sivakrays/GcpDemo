package com.example.demo.service;


import com.example.demo.model.KanchipuramModel;
import com.example.demo.util.KancipuramUtil;
import com.example.demo.util.Util;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KanchipuramService {

    RestTemplate restTemplate = new RestTemplate();

public KanchipuramModel getHtmlResponse(String path) {



    String urlResponse = restTemplate.getForObject("https://vedabase.io/en/library/sb/" + path, String.class);

    KanchipuramModel kanchipuramModel =new KanchipuramModel();

  String devangari=  KancipuramUtil.getResponse(urlResponse, Util.devanagari);
  String verseText=  KancipuramUtil.getResponse(urlResponse, Util.verseText);
  String synonyms=   KancipuramUtil.getResponse(urlResponse, Util.synonyms);
  String translation=  KancipuramUtil.getResponse(urlResponse, Util.translation);
 //  String purport =  KancipuramUtil.getResponse(urlResponse, Util.puport);

    kanchipuramModel.setDevanagari(devangari);
    kanchipuramModel.setVerseText(verseText);
    kanchipuramModel.setSynonyms(synonyms);
    kanchipuramModel.setTranslation(translation);
  //  kanchipuramModel.setPurport(purport);

return kanchipuramModel;
}
}




