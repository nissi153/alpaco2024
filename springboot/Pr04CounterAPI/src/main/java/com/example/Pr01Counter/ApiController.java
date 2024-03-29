package com.example.Pr01Counter;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ApiController {
    private final Counter counter;

    @PostMapping("/plus")
    public ResDto plus(@RequestBody ReqDto reqDto){
        if( reqDto.getOp().equals("plus") ){
            counter.setCount( counter.getCount() + 1 );
        }
        ResDto resDto = new ResDto();
        resDto.setStatus("ok");
        resDto.setResult( counter.getCount() );
        return resDto;
    }
    @PostMapping("/minus")
    public ResDto minus(@RequestBody ReqDto reqDto){
        if( reqDto.getOp().equals("minus") ){
            counter.setCount( counter.getCount() - 1 );
        }
        ResDto resDto = new ResDto();
        resDto.setStatus("ok");
        resDto.setResult( counter.getCount() );
        return resDto;
    }
}
