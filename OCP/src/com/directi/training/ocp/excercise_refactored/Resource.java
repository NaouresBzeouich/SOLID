package com.directi.training.ocp.excercise_refactored;

public interface Resource {
    int allocate();
    void free(int resourceId);
}