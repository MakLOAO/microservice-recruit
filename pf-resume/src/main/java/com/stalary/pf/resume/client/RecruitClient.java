package com.stalary.pf.resume.client;

import com.stalary.pf.resume.data.dto.Recruit;
import com.stalary.pf.resume.data.vo.ResponseMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Stalary
 * @description
 * @date 2019/1/1
 */
@FeignClient(name = "recruit", url = "${gateway.server}")
@Component
public interface RecruitClient {

    @GetMapping("/recruit/list")
    ResponseMessage<List<Recruit>> getRecruitList(@RequestParam("userId") Long userId);

    @GetMapping("/recruit")
    ResponseMessage<Recruit> getRecruit(@RequestParam("recruitId") Long recruitId);
}