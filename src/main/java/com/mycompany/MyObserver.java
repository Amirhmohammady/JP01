package com.mycompany;

import com.mycompany.slidemodel.Slide;

public interface MyObserver {
    void update(Presentation presentation, Slide data);
}
