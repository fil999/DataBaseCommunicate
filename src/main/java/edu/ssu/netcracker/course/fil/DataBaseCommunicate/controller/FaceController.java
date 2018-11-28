package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Face;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.FaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by --- on 27.11.2018.
 */
@Controller
@RequestMapping("/face")
public class FaceController {

    @Autowired
    private FaceRepository faceRepository;

    @ResponseBody
    @RequestMapping(value = "/selectAllFace",  method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Face> selectAll() {
        Iterable<Face> faceIterable = faceRepository.findAll();
        return faceIterable;
    }
}
