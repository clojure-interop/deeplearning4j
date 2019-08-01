(ns org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace
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
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatVariableSpace]))

(defn ->float-variable-space
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatVariableSpace [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatVariableSpace p))
  (^Nd4jCuda$FloatVariableSpace []
    (new Nd4jCuda$FloatVariableSpace )))

(defn put-variable
  "id - `int`
  idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatVariableSpace this ^Integer id ^Integer idx ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray array]
    (-> this (.putVariable id idx array)))
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray array]
    (-> this (.putVariable pair array))))

(defn put-output-variable
  "variable - `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$FloatVariable variable]
    (-> this (.putOutputVariable variable))))

(defn total-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatVariableSpace this]
    (-> this (.totalMemory))))

(defn total-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.totalEntries))))

(defn handles
  "returns: `(value="nd4j::graph::Variable<float>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$FloatVariableSpace this]
    (-> this (.handles))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.getRNG))))

(defn inject-variable
  "pair - `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`
  variable - `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCuda$FloatVariable variable]
    (-> this (.injectVariable pair variable))))

(defn external-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatVariableSpace this]
    (-> this (.externalMemory))))

(defn put
  "other - `org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace`

  returns: `(value="operator =")  org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace`"
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace other]
    (-> this (.put other))))

(defn number-of-placeholders
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.numberOfPlaceholders))))

(defn set-flow-path
  "timers - `org.nd4j.nativeblas.Nd4jCuda$FlowPath`"
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$FlowPath timers]
    (-> this (.setFlowPath timers))))

(defn internal-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.internalEntries))))

(defn set-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$Workspace workspace]
    (-> this (.setWorkspace workspace))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace [^Nd4jCuda$FloatVariableSpace this ^Long position]
    (-> this (.position position))))

(defn flow-path
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FlowPath`"
  (^org.nd4j.nativeblas.Nd4jCuda$FlowPath [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.flowPath))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList`"
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.workspace))))

(defn external-entries
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.externalEntries))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn has-variable
  "id - `int`
  idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariableSpace this ^Integer id ^Integer idx]
    (-> this (.hasVariable id idx)))
  ([^Nd4jCuda$FloatVariableSpace this ^Integer id]
    (-> this (.hasVariable id))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatStash`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatStash [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.getStash))))

(defn get-external-variables
  "returns: `(value="nd4j::graph::Variable<float>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$FloatVariableSpace this]
    (-> this (.getExternalVariables))))

(defn drop-variable
  "id - `int`
  idx - `int`"
  ([^Nd4jCuda$FloatVariableSpace this ^Integer id ^Integer idx]
    (-> this (.dropVariable id idx)))
  ([^Nd4jCuda$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair pair]
    (-> this (.dropVariable pair))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariableSpace [^Nd4jCuda$FloatVariableSpace this]
    (-> this (.clone))))

(defn get-placeholders
  "returns: `(value="nd4j::graph::Variable<float>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$FloatVariableSpace this]
    (-> this (.getPlaceholders))))

(defn has-external-variable
  "it - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariableSpace this ^Integer it]
    (-> this (.hasExternalVariable it))))

(defn internal-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatVariableSpace this]
    (-> this (.internalMemory))))

(defn get-variable
  "id - `int`
  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatVariableSpace this ^Integer id ^Integer idx]
    (-> this (.getVariable id idx)))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatVariableSpace this ^Integer id]
    (-> this (.getVariable id))))

