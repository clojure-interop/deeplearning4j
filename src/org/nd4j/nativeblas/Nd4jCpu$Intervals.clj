(ns org.nd4j.nativeblas.Nd4jCpu$Intervals
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
  (:import [org.nd4j.nativeblas Nd4jCpu$Intervals]))

(defn ->intervals
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$Intervals [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$Intervals p))
  (^Nd4jCpu$Intervals []
    (new Nd4jCpu$Intervals )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$Intervals`"
  (^org.nd4j.nativeblas.Nd4jCpu$Intervals [^Nd4jCpu$Intervals this ^Long position]
    (-> this (.position position))))

(defn get
  "i - `long`

  returns: `(value="Nd4jLong*")  (value="operator []")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCpu$Intervals this ^Long i]
    (-> this (.get i))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCpu$Intervals this]
    (-> this (.size))))

