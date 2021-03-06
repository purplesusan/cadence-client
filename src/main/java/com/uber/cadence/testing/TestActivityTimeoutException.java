/*
 *  Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *  Modifications copyright (C) 2017 Uber Technologies, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"). You may not
 *  use this file except in compliance with the License. A copy of the License is
 *  located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 *  or in the "license" file accompanying this file. This file is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package com.uber.cadence.testing;

import com.uber.cadence.TimeoutType;

/**
 * TestActivityTimeoutException can be thrown from an activity implementation to simulate an
 * activity timeout. To be used only in unit tests. The workflow code is going to receive it as
 * {@link com.uber.cadence.workflow.ActivityTimeoutException}.
 */
public final class TestActivityTimeoutException extends RuntimeException {

  private final TimeoutType timeoutType;

  private final Object details;

  public TestActivityTimeoutException(TimeoutType timeoutType, Object details) {
    this.timeoutType = timeoutType;
    this.details = details;
  }

  public TestActivityTimeoutException(TimeoutType timeoutType) {
    this.timeoutType = timeoutType;
    this.details = null;
  }

  public TimeoutType getTimeoutType() {
    return timeoutType;
  }

  public Object getDetails() {
    return details;
  }
}
