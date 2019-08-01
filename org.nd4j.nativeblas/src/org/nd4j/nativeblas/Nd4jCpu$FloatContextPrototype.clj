(ns org.nd4j.nativeblas.Nd4jCpu$FloatContextPrototype
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
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatContextPrototype]))

(defn ->float-context-prototype
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatContextPrototype [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatContextPrototype p))
  (^Nd4jCpu$FloatContextPrototype []
    (new Nd4jCpu$FloatContextPrototype )))

(defn width
  "This method returns number of inputs available in this block

  returns: `(value="unsigned long")  long`"
  ([^Nd4jCpu$FloatContextPrototype this]
    (-> this (.width))))

(defn get-t-arguments
  "returns: `org.bytedeco.javacpp.FloatPointer`"
  (^org.bytedeco.javacpp.FloatPointer [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.getTArguments))))

(defn num-t
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.numT))))

(defn mark-inplace
  "really-inplace - `boolean`"
  ([^Nd4jCpu$FloatContextPrototype this ^Boolean really-inplace]
    (-> this (.markInplace really-inplace))))

(defn pick-input
  "input - `int`
  index - `int`"
  ([^Nd4jCpu$FloatContextPrototype this ^Integer input ^Integer index]
    (-> this (.pickInput input index)))
  ([^Nd4jCpu$FloatContextPrototype this ^Integer input]
    (-> this (.pickInput input))))

(defn fill-inputs
  "inputs - `org.bytedeco.javacpp.IntPointer`"
  ([^Nd4jCpu$FloatContextPrototype this ^org.bytedeco.javacpp.IntPointer inputs]
    (-> this (.fillInputs inputs))))

(defn node-id
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.nodeId))))

(defn op-num
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.opNum))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatContextPrototype [^Nd4jCpu$FloatContextPrototype this ^Long position]
    (-> this (.position position))))

(defn get-node-id
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.getNodeId))))

(defn has-variables-filled
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FloatContextPrototype this]
    (-> this (.hasVariablesFilled))))

(defn num-i
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.numI))))

(defn input
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$FloatContextPrototype this ^Integer idx]
    (-> this (.input idx))))

(defn is-inplace
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FloatContextPrototype this]
    (-> this (.isInplace))))

(defn set-op-num
  "op-num - `int`"
  ([^Nd4jCpu$FloatContextPrototype this ^Integer op-num]
    (-> this (.setOpNum op-num))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FloatContextPrototype`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatContextPrototype [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.clone))))

(defn inputs
  "returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.inputs))))

(defn get-i-arguments
  "returns: `org.bytedeco.javacpp.IntPointer`"
  (^org.bytedeco.javacpp.IntPointer [^Nd4jCpu$FloatContextPrototype this]
    (-> this (.getIArguments))))

