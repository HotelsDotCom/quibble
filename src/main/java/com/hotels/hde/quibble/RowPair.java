/**
 * Copyright (C) 2015-2019 Expedia, Inc.
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
package com.hotels.hde.quibble;

public class RowPair {

  private final String[] firstRSRow;
  private final String[] secondRSRow;

  public RowPair(int numberOfColumns) {
    firstRSRow = new String[numberOfColumns];
    secondRSRow = new String[numberOfColumns];
  }

  public RowPair(String[] firstRSRow, String[] secondRSRow) {
    this.firstRSRow = firstRSRow;
    this.secondRSRow = secondRSRow;
  }

  public String[] getFirstRSRow() {
    return firstRSRow;
  }

  public String[] getSecondRSRow() {
    return secondRSRow;
  }

}
