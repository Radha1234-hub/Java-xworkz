package com.xworkz.paintingapp.painting;

import com.xworkz.paintingapp.art.Art;

public class Painting extends Art {

    @Override

    public void color(){
        System.out.println(" The use of color can convey emotion, mood, and atmosphere. Bold, contrasting hues can create drama, while soft, harmonious tones evoke serenity.");
    }

    @Override
    public void line() {
        System.out.println("Lines in painting add direction, movement, or serenity depending on their style.");
    }

    @Override
    public void shape() {
        System.out.println("Shapes bring a dynamic balance between geometric precision and organic forms in painting.");
    }

    @Override
    public void texture() {
        System.out.println("Texture in painting creates tactile interest through layering and unique applications.");
    }

    @Override
    public void space() {
        System.out.println("Space represents depth, perspective, or arrangement, enhancing the painting's composition.");
    }
}
