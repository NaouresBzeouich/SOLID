package com.directi.training.ocp.excercise_refactored;

public class ResourceAllocator {
    public int allocate(Resource resource) {
        return resource.allocate();
    }

    public void free(Resource resource, int resourceId) {
        resource.free(resourceId);
    }
}