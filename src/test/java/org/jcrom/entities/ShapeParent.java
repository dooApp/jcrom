/**
 * This file is part of the JCROM project.
 * Copyright (C) 2008-2015 - All rights reserved.
 * Authors: Olafur Gauti Gudmundsson, Nicolas Dos Santos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jcrom.entities;

import java.util.ArrayList;
import java.util.List;

import org.jcrom.AbstractJcrEntity;
import org.jcrom.annotations.JcrChildNode;

/**
 *
 * @author Olafur Gauti Gudmundsson
 * @author Nicolas Dos Santos
 */
public class ShapeParent extends AbstractJcrEntity {

    private static final long serialVersionUID = 1L;

    @JcrChildNode
    private Shape mainShape;
    @JcrChildNode
    private List<Shape> shapes;

    public ShapeParent() {
        super();
        this.shapes = new ArrayList<Shape>();
    }

    public Shape getMainShape() {
        return mainShape;
    }

    public void setMainShape(Shape mainShape) {
        this.mainShape = mainShape;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

}
