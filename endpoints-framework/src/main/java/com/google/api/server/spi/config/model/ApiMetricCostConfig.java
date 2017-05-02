/*
 * Copyright 2017 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.server.spi.config.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ApiMetricCostConfig {
  public abstract String name();
  public abstract int cost();

  public static Builder builder() {
    return new AutoValue_ApiMetricCostConfig.Builder();
  }

  @AutoValue.Builder
  public static abstract class Builder {
    public abstract Builder setName(String name);
    public abstract Builder setCost(int cost);
    public abstract ApiMetricCostConfig build();
  }
}
