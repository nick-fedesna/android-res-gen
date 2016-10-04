/*
 * Copyright 2016 Vokal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vokal.gradle.resgen

/**
 * Represents the different densities we can scale assets for.
 */
enum Density {

    LDPI(0.75f),
    MDPI(1),
    HDPI(1.5f),
    XHDPI(2),
    XXHDPI(3),
    XXXHDPI(4);

    float multiplier;

    Density(float multiplier) {
        this.multiplier = multiplier
    }

    float getMultiplier() {
        return multiplier
    }
}