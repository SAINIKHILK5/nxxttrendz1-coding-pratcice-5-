/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here

package com.example.nxttrendz1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.nxttrendz1.repository.*;
import com.example.nxttrendz1.repository.ReviewRepository;
import com.example.nxttrendz1.model.Review;
import java.util.*;

@Service
public class ReviewJpaService implements ReviewRepository {

    @Autowired
    private ReviewJpaRepository rj;

    @Override
    public ArrayList<Review> getReviews() {
        List<Review> l2 = rj.findAll();
        ArrayList<Review> a2 = new ArrayList<>(l2);
        return a2;

    }
}
