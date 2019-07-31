(ns org.nd4j.nativeblas.Nd4jCpu$FloatGraphState
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
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatGraphState]))

(defn ->float-graph-state
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatGraphState [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatGraphState p)))

(defn id
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$FloatGraphState this]
    (-> this (.id))))

(defn register-scope
  "This method adds scope to this state tracker

  scope-id - `int`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$FloatGraphState this ^Integer scope-id]
    (-> this (.registerScope scope-id))))

(defn has-scope
  "This method cheks if scope with given ID exists

  scope-id - - ID of the scope - `int`

  returns: - TRUE if scope exists, FALSE otherwise - `(value="bool")  boolean`"
  ([^Nd4jCpu$FloatGraphState this ^Integer scope-id]
    (-> this (.hasScope scope-id))))

(defn forget-scope
  "This method removes specified scope from this state tracker

  scope-id - `int`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$FloatGraphState this ^Integer scope-id]
    (-> this (.forgetScope scope-id))))

(defn attach-op-to-scope
  "This method adds given op to the end of specified scope

  op-num - `long`
  type - `int`
  inputs - `org.nd4j.nativeblas.Nd4jCpu$ArgumentsList`

  returns: `(value="Nd4jStatus")  int attachOpToScope(int scopeId, @`"
  ([^Nd4jCpu$FloatGraphState this ^Long op-num ^Integer type ^org.nd4j.nativeblas.Nd4jCpu$ArgumentsList inputs]
    (-> this (.attachOpToScope op-num type inputs))))

(defn define-return
  "This method adds return statement to specified scope
  PLEASE NOTE: should be used only in body scopes

  scope-id - `int`
  node-id - `int`
  args - `org.nd4j.nativeblas.Nd4jCpu$ArgumentsList`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$FloatGraphState this ^Integer scope-id ^Integer node-id ^org.nd4j.nativeblas.Nd4jCpu$ArgumentsList args]
    (-> this (.defineReturn scope-id node-id args))))

(defn variable-space
  "This method returns current variable space of this state holder

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatVariableSpace [^Nd4jCpu$FloatGraphState this]
    (-> this (.variableSpace))))

