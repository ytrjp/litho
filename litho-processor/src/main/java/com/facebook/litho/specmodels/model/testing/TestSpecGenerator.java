/*
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.specmodels.model.testing;

import com.facebook.litho.specmodels.model.HasEnclosedSpecModel;
import com.facebook.litho.specmodels.model.SpecModel;
import com.squareup.javapoet.TypeSpec;

/** Generates the test matchers for a {@link TestSpecModel}. */
public interface TestSpecGenerator {
  <T extends SpecModel & HasEnclosedSpecModel> TypeSpec generate(T testSpecModel);
}
