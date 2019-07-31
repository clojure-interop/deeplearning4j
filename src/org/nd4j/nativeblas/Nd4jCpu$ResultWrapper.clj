(ns org.nd4j.nativeblas.Nd4jCpu$ResultWrapper
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
  (:import [org.nd4j.nativeblas Nd4jCpu$ResultWrapper]))

(defn ->result-wrapper
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$ResultWrapper [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$ResultWrapper p)))

(defn size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$ResultWrapper this]
    (-> this (.size))))

(defn pointer
  "returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCpu$ResultWrapper this]
    (-> this (.pointer))))

