(ns org.nd4j.nativeblas.Nd4jCuda$FloatVariable
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
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatVariable]))

(defn ->float-variable
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatVariable [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatVariable p))
  (^Nd4jCuda$FloatVariable [^java.lang.String name ^Integer id ^Integer idx]
    (new Nd4jCuda$FloatVariable name id idx))
  (^Nd4jCuda$FloatVariable [^java.lang.String name ^Integer id]
    (new Nd4jCuda$FloatVariable name id))
  (^Nd4jCuda$FloatVariable []
    (new Nd4jCuda$FloatVariable )))

(defn index
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatVariable this]
    (-> this (.index))))

(defn set-variable-type
  "variable-type - `int`"
  ([^Nd4jCuda$FloatVariable this ^Integer variable-type]
    (-> this (.setVariableType variable-type))))

(defn mark-external
  "This method returns InputType of this variable

  really-external - `boolean`"
  ([^Nd4jCuda$FloatVariable this ^Boolean really-external]
    (-> this (.markExternal really-external))))

(defn set-nd-array
  "array - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatVariable this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray array]
    (-> this (.setNDArray array))))

(defn get-nd-array-list
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList [^Nd4jCuda$FloatVariable this]
    (-> this (.getNDArrayList))))

(defn set-name
  "name - `org.bytedeco.javacpp.BytePointer`

  returns: `void setName( @`"
  ([^Nd4jCuda$FloatVariable this ^org.bytedeco.javacpp.BytePointer name]
    (-> this (.setName name))))

(defn variable-type
  "returns: `(value="nd4j::graph::VariableType")  int`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.variableType))))

(defn id
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatVariable this]
    (-> this (.id))))

(defn mark-removable
  "really-removable - `boolean`"
  ([^Nd4jCuda$FloatVariable this ^Boolean really-removable]
    (-> this (.markRemovable really-removable))))

(defn is-removable
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.isRemovable))))

(defn get-name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.getName))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatVariable this ^Long position]
    (-> this (.position position))))

(defn set-id
  "id - `int`
  idx - `int`"
  ([^Nd4jCuda$FloatVariable this ^Integer id ^Integer idx]
    (-> this (.setId id idx)))
  ([^Nd4jCuda$FloatVariable this ^Integer id]
    (-> this (.setId id))))

(defn has-nd-array
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.hasNDArray))))

(defn set-nd-array-list
  "list - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList`"
  ([^Nd4jCuda$FloatVariable this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayList list]
    (-> this (.setNDArrayList list))))

(defn is-placeholder
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.isPlaceholder))))

(defn get-nd-array
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatVariable this]
    (-> this (.getNDArray))))

(defn set-index
  "index - `int`"
  ([^Nd4jCuda$FloatVariable this ^Integer index]
    (-> this (.setIndex index))))

(defn is-external
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.isExternal))))

(defn mark-read-only
  "really-read-only - `boolean`"
  ([^Nd4jCuda$FloatVariable this ^Boolean really-read-only]
    (-> this (.markReadOnly really-read-only))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatVariable this]
    (-> this (.clone))))

(defn is-empty
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.isEmpty))))

(defn is-read-only
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.isReadOnly))))

(defn has-nd-array-list
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatVariable this]
    (-> this (.hasNDArrayList))))

