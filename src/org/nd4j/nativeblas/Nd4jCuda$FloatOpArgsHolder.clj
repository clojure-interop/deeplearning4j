(ns org.nd4j.nativeblas.Nd4jCuda$FloatOpArgsHolder
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
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatOpArgsHolder]))

(defn ->float-op-args-holder
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatOpArgsHolder [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatOpArgsHolder p)))

(defn get-in-arrs
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector [^Nd4jCuda$FloatOpArgsHolder this]
    (-> this (.getInArrs))))

(defn get-t-args
  "returns: `org.bytedeco.javacpp.FloatPointer`"
  (^org.bytedeco.javacpp.FloatPointer [^Nd4jCuda$FloatOpArgsHolder this]
    (-> this (.getTArgs))))

(defn get-i-args
  "returns: `(value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatOpArgsHolder this]
    (-> this (.getIArgs))))

(defn get-alloc-info
  "returns: `(value="bool*")   org.bytedeco.javacpp.BoolPointer`"
  ([^Nd4jCuda$FloatOpArgsHolder this]
    (-> this (.getAllocInfo))))

(defn get-num-in-arrs
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatOpArgsHolder this]
    (-> this (.getNumInArrs))))

(defn get-num-t-args
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatOpArgsHolder this]
    (-> this (.getNumTArgs))))

(defn get-num-i-args
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatOpArgsHolder this]
    (-> this (.getNumIArgs))))

(defn create-args-holder-for-bp
  "is-in-place - `boolean`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatOpArgsHolder createArgsHolderForBP(  org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector inGradArrs, @`"
  ([^Nd4jCuda$FloatOpArgsHolder this ^Boolean is-in-place]
    (-> this (.createArgsHolderForBP is-in-place))))

