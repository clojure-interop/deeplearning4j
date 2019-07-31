(ns org.nd4j.nativeblas.Nd4jCuda$_loader
  "Copyright (c) 2015-2018 Skymind, Inc.
 This program and the accompanying materials are made available under the
 terms of the Apache License, Version 2.0 which is available at
 https://www.apache.org/licenses/LICENSE-2.0.
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT
 WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 License for the specific language governing permissions and limitations
 under the License.
 SPDX-License-Identifier: Apache-2.0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$_loader]))

(defn ->loader
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$_loader [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$_loader p))
  (^Nd4jCuda$_loader []
    (new Nd4jCuda$_loader )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$_loader`"
  (^org.nd4j.nativeblas.Nd4jCuda$_loader [^Nd4jCuda$_loader this ^Long position]
    (-> this (.position position))))

