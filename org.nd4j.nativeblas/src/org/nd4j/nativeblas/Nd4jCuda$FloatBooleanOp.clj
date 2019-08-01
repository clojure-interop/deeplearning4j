(ns org.nd4j.nativeblas.Nd4jCuda$FloatBooleanOp
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
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatBooleanOp]))

(defn ->float-boolean-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatBooleanOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatBooleanOp p)))

(defn evaluate
  "args - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector args]
    (-> this (.evaluate args))))

(defn execute
  "Description copied from class: Nd4jCuda.FloatDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCuda$FloatContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$FloatBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$FloatContext block]
    (-> this (.execute block))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$FloatBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

