// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package org.moe.samples.openglbox.common;

public class Geometry {

    public static final float[] VERTICES = new float[] {
        // Front
        +1, -1, +1, 1, 1, // x, y, z, U, V
        +1, +1, +1, 1, 0,
        -1, +1, +1, 0, 0,
        -1, -1, +1, 0, 1,
        // Back
        +1, +1, -1, 0, 0,
        -1, -1, -1, 1, 1,
        +1, -1, -1, 0, 1,
        -1, +1, -1, 1, 0,
        // Left
        -1, -1, +1, 1, 1,
        -1, +1, +1, 1, 0,
        -1, +1, -1, 0, 0,
        -1, -1, -1, 0, 1,
        // Right
        +1, -1, -1, 1, 1,
        +1, +1, -1, 1, 0,
        +1, +1, +1, 0, 0,
        +1, -1, +1, 0, 1,
        // Top
        +1, +1, +1, 0, 0,
        +1, +1, -1, 0, 1,
        -1, +1, -1, 1, 1,
        -1, +1, +1, 1, 0,
        // Bottom
        +1, -1, -1, 1, 0,
        +1, -1, +1, 1, 1,
        -1, -1, +1, 0, 1,
        -1, -1, -1, 0, 0
    };

    public static final byte[] INDICES = {
        // Front
        0, 1, 2,
        2, 3, 0,
        // Back
        4, 6, 5,
        4, 5, 7,
        // Left
        8, 9, 10,
        10, 11, 8,
        // Right
        12, 13, 14,
        14, 15, 12,
        // Top
        16, 17, 18,
        18, 19, 16,
        // Bottom
        20, 21, 22,
        22, 23, 20
    };
}
