(ns org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayList
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
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatNDArrayList]))

(defn ->float-nd-array-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatNDArrayList [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatNDArrayList p)))

(defn counter
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatNDArrayList this]
    (-> this (.counter))))

(defn unstack
  "array - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`
  axis - `int`"
  ([^Nd4jCpu$FloatNDArrayList this ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray array ^Integer axis]
    (-> this (.unstack array axis))))

(defn height
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatNDArrayList this]
    (-> this (.height))))

(defn pick
  "indices - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray [^Nd4jCpu$FloatNDArrayList this ^org.bytedeco.javacpp.IntPointer indices]
    (-> this (.pick indices))))

(defn read-raw
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray [^Nd4jCpu$FloatNDArrayList this ^Integer idx]
    (-> this (.readRaw idx))))

(defn id
  "returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$FloatNDArrayList this]
    (-> this (.id))))

(defn read
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray [^Nd4jCpu$FloatNDArrayList this ^Integer idx]
    (-> this (.read idx))))

(defn name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCpu$FloatNDArrayList this]
    (-> this (.name))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$FloatNDArrayList this]
    (-> this (.workspace))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayList [^Nd4jCpu$FloatNDArrayList this]
    (-> this (.clone))))

(defn write
  "idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$FloatNDArrayList this ^Integer idx ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray array]
    (-> this (.write idx array))))

(defn equals
  "other - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayList`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FloatNDArrayList this ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayList other]
    (-> this (.equals other))))

(defn elements
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatNDArrayList this]
    (-> this (.elements))))

(defn is-written
  "index - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FloatNDArrayList this ^Integer index]
    (-> this (.isWritten index))))

(defn stack
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray [^Nd4jCpu$FloatNDArrayList this]
    (-> this (.stack))))

