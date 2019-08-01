(ns org.nd4j.nativeblas.Nd4jCpu$KeyPair
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
  (:import [org.nd4j.nativeblas Nd4jCpu$KeyPair]))

(defn ->key-pair
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$KeyPair [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$KeyPair p))
  (^Nd4jCpu$KeyPair []
    (new Nd4jCpu$KeyPair )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$KeyPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$KeyPair [^Nd4jCpu$KeyPair this ^Long position]
    (-> this (.position position))))

(defn less-than
  "other - `org.nd4j.nativeblas.Nd4jCpu$KeyPair`

  returns: `(value="bool") (value="operator <")  boolean`"
  ([^Nd4jCpu$KeyPair this ^org.nd4j.nativeblas.Nd4jCpu$KeyPair other]
    (-> this (.lessThan other))))

