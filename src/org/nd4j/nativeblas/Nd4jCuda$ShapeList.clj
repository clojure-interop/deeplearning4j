(ns org.nd4j.nativeblas.Nd4jCuda$ShapeList
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
  (:import [org.nd4j.nativeblas Nd4jCuda$ShapeList]))

(defn ->shape-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$ShapeList [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$ShapeList p))
  (^Nd4jCuda$ShapeList []
    (new Nd4jCuda$ShapeList )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$ShapeList this ^Long position]
    (-> this (.position position))))

(defn as-vector
  "returns: `(value="Nd4jLong**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$ShapeList this]
    (-> this (.asVector))))

(defn destroy
  ""
  ([^Nd4jCuda$ShapeList this]
    (-> this (.destroy))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCuda$ShapeList this]
    (-> this (.size))))

(defn at
  "idx - `int`

  returns: `(value="Nd4jLong*")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$ShapeList this ^Integer idx]
    (-> this (.at idx))))

(defn push-back
  "shape - `org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$ShapeList this ^org.bytedeco.javacpp.LongPointer shape]
    (-> this (.push_back shape))))

(defn detach
  "PLEASE NOTE: This method should be called ONLY if shapes were generated at workspaces. Otherwise you'll get memory leak"
  ([^Nd4jCuda$ShapeList this]
    (-> this (.detach))))

