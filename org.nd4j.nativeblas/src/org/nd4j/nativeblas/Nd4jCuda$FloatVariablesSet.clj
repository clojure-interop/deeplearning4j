(ns org.nd4j.nativeblas.Nd4jCuda$FloatVariablesSet
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
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatVariablesSet]))

(defn ->float-variables-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatVariablesSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatVariablesSet p))
  (^Nd4jCuda$FloatVariablesSet []
    (new Nd4jCuda$FloatVariablesSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariablesSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariablesSet [^Nd4jCuda$FloatVariablesSet this ^Long position]
    (-> this (.position position))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$FloatVariablesSet this]
    (-> this (.status))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatVariablesSet this]
    (-> this (.size))))

(defn push-back
  "variable - `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  ([^Nd4jCuda$FloatVariablesSet this ^org.nd4j.nativeblas.Nd4jCuda$FloatVariable variable]
    (-> this (.push_back variable))))

(defn at
  "index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariable`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatVariable [^Nd4jCuda$FloatVariablesSet this ^Integer index]
    (-> this (.at index))))

