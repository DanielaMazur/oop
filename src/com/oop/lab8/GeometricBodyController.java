package com.oop.lab8;

import java.util.ArrayList;

public class GeometricBodyController {

    GeometricBody biggestVolumeBody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody maxVolumeBody = geometricBodies.get(0);

        for(GeometricBody body : geometricBodies){
            if(maxVolumeBody.getVolume() < body.getVolume()){
                maxVolumeBody = body;
            }
        }

        return maxVolumeBody;
    }

    GeometricBody biggestSurfaceBody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody maxSurfaceBody = geometricBodies.get(0);

        for(GeometricBody body:geometricBodies){
            if(maxSurfaceBody.getSurface() < body.getSurface()){
                maxSurfaceBody = body;
            }
        }

        return maxSurfaceBody;
    }
}
