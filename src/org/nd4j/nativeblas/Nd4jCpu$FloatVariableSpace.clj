(ns org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace
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
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatVariableSpace]))

(defn ->float-variable-space
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatVariableSpace [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatVariableSpace p))
  (^Nd4jCpu$FloatVariableSpace []
    (new Nd4jCpu$FloatVariableSpace )))

(defn put-variable
  "id - `int`
  idx - `int`
  array - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  ([^Nd4jCpu$FloatVariableSpace this ^Integer id ^Integer idx ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray array]
    (-> this (.putVariable id idx array)))
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray array]
    (-> this (.putVariable pair array))))

(defn put-output-variable
  "variable - `org.nd4j.nativeblas.Nd4jCpu$FloatVariable`"
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$FloatVariable variable]
    (-> this (.putOutputVariable variable))))

(defn total-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$FloatVariableSpace this]
    (-> this (.totalMemory))))

(defn total-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.totalEntries))))

(defn handles
  "returns: `(value="nd4j::graph::Variable<float>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$FloatVariableSpace this]
    (-> this (.handles))))

(defn get-rng
  "returns: `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.getRNG))))

(defn inject-variable
  "pair - `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`
  variable - `org.nd4j.nativeblas.Nd4jCpu$FloatVariable`"
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair ^org.nd4j.nativeblas.Nd4jCpu$FloatVariable variable]
    (-> this (.injectVariable pair variable))))

(defn external-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$FloatVariableSpace this]
    (-> this (.externalMemory))))

(defn put
  "other - `org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace`

  returns: `(value="operator =")  org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace`"
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace other]
    (-> this (.put other))))

(defn number-of-placeholders
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.numberOfPlaceholders))))

(defn set-flow-path
  "timers - `org.nd4j.nativeblas.Nd4jCpu$FlowPath`"
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$FlowPath timers]
    (-> this (.setFlowPath timers))))

(defn internal-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.internalEntries))))

(defn set-workspace
  "workspace - `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$Workspace workspace]
    (-> this (.setWorkspace workspace))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace [^Nd4jCpu$FloatVariableSpace this ^Long position]
    (-> this (.position position))))

(defn flow-path
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FlowPath`"
  (^org.nd4j.nativeblas.Nd4jCpu$FlowPath [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.flowPath))))

(defn track-list
  "list - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayList`"
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayList list]
    (-> this (.trackList list))))

(defn workspace
  "returns: `org.nd4j.nativeblas.Nd4jCpu$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$Workspace [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.workspace))))

(defn external-entries
  "returns: `int`"
  (^Integer [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.externalEntries))))

(defn set-rng
  "rng - `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer rng]
    (-> this (.setRNG rng))))

(defn has-variable
  "id - `int`
  idx - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FloatVariableSpace this ^Integer id ^Integer idx]
    (-> this (.hasVariable id idx)))
  ([^Nd4jCpu$FloatVariableSpace this ^Integer id]
    (-> this (.hasVariable id))))

(defn get-stash
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FloatStash`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatStash [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.getStash))))

(defn get-external-variables
  "returns: `(value="nd4j::graph::Variable<float>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$FloatVariableSpace this]
    (-> this (.getExternalVariables))))

(defn drop-variable
  "id - `int`
  idx - `int`"
  ([^Nd4jCpu$FloatVariableSpace this ^Integer id ^Integer idx]
    (-> this (.dropVariable id idx)))
  ([^Nd4jCpu$FloatVariableSpace this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair pair]
    (-> this (.dropVariable pair))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace [^Nd4jCpu$FloatVariableSpace this]
    (-> this (.clone))))

(defn get-placeholders
  "returns: `(value="nd4j::graph::Variable<float>**")   org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCpu$FloatVariableSpace this]
    (-> this (.getPlaceholders))))

(defn has-external-variable
  "it - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FloatVariableSpace this ^Integer it]
    (-> this (.hasExternalVariable it))))

(defn internal-memory
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$FloatVariableSpace this]
    (-> this (.internalMemory))))

(defn get-variable
  "id - `int`
  idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatVariable`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatVariable [^Nd4jCpu$FloatVariableSpace this ^Integer id ^Integer idx]
    (-> this (.getVariable id idx)))
  (^org.nd4j.nativeblas.Nd4jCpu$FloatVariable [^Nd4jCpu$FloatVariableSpace this ^Integer id]
    (-> this (.getVariable id))))

