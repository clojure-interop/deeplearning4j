(ns org.nd4j.nativeblas.Nd4jCpu$ExternalWorkspace
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
  (:import [org.nd4j.nativeblas Nd4jCpu$ExternalWorkspace]))

(defn ->external-workspace
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$ExternalWorkspace [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$ExternalWorkspace p))
  (^Nd4jCpu$ExternalWorkspace []
    (new Nd4jCpu$ExternalWorkspace )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ExternalWorkspace`"
  (^org.nd4j.nativeblas.Nd4jCpu$ExternalWorkspace [^Nd4jCpu$ExternalWorkspace this ^Long position]
    (-> this (.position position))))

(defn pointer-host
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^Nd4jCpu$ExternalWorkspace this]
    (-> this (.pointerHost))))

(defn pointer-device
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^Nd4jCpu$ExternalWorkspace this]
    (-> this (.pointerDevice))))

(defn size-host
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$ExternalWorkspace this]
    (-> this (.sizeHost))))

(defn size-device
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$ExternalWorkspace this]
    (-> this (.sizeDevice))))

