(ns org.nd4j.nativeblas.Nd4jCpu$ArgumentsList
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
  (:import [org.nd4j.nativeblas Nd4jCpu$ArgumentsList]))

(defn ->arguments-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$ArgumentsList [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$ArgumentsList p))
  (^Nd4jCpu$ArgumentsList []
    (new Nd4jCpu$ArgumentsList )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ArgumentsList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ArgumentsList [^Nd4jCpu$ArgumentsList this ^Long position]
    (-> this (.position position))))

(defn size
  "This method returns number of argument pairs available

  returns: `int`"
  (^Integer [^Nd4jCpu$ArgumentsList this]
    (-> this (.size))))

(defn at
  "This method returns Pair at specified index

  index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$Pair`"
  (^org.nd4j.nativeblas.Nd4jCpu$Pair [^Nd4jCpu$ArgumentsList this ^Integer index]
    (-> this (.at index))))

