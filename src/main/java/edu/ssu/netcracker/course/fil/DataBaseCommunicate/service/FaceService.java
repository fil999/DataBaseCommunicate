package edu.ssu.netcracker.course.fil.DataBaseCommunicate.service;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Face;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.FaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by --- on 29.11.2018.
 */
@Controller
public class FaceService {

    @Autowired
    private FaceRepository faceRepository;

    public List<Face> selectAllFace() {
        return faceRepository.findAll();
    }
}
