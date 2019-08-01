(ns org.nd4j.nativeblas.Nd4jCpu$FloatDeclarableListOp
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
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatDeclarableListOp]))

(defn ->float-declarable-list-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatDeclarableListOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatDeclarableListOp p)))

(defn execute
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$FloatDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.execute block)))
  (^org.nd4j.nativeblas.Nd4jCpu$FloatResultSet [^Nd4jCpu$FloatDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayList list ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector inputs ^org.bytedeco.javacpp.FloatPointer t-args ^org.bytedeco.javacpp.IntPointer i-args]
    (-> this (.execute list inputs t-args i-args))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$FloatDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

