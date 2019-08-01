(ns org.nd4j.nativeblas.Nd4jCpu$FlowPath
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
  (:import [org.nd4j.nativeblas Nd4jCpu$FlowPath]))

(defn ->flow-path
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FlowPath [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FlowPath p))
  (^Nd4jCpu$FlowPath []
    (new Nd4jCpu$FlowPath )))

(defn is-frame-active
  "frame-id - `long`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FlowPath this ^Long frame-id]
    (-> this (.isFrameActive frame-id))))

(defn is-node-active
  "node-id - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FlowPath this ^Integer node-id]
    (-> this (.isNodeActive node-id))))

(defn outer-time
  "node-id - `int`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$FlowPath this ^Integer node-id]
    (-> this (.outerTime node-id))))

(defn forget-frame
  "frame-id - `long`"
  ([^Nd4jCpu$FlowPath this ^Long frame-id]
    (-> this (.forgetFrame frame-id))))

(defn set-outer-time
  "time - `long`

  returns: `void setOuterTime(int nodeId, @`"
  ([^Nd4jCpu$FlowPath this ^Long time]
    (-> this (.setOuterTime time))))

(defn set-inner-time
  "time - `long`

  returns: `void setInnerTime(int nodeId, @`"
  ([^Nd4jCpu$FlowPath this ^Long time]
    (-> this (.setInnerTime time))))

(defn set-rewind-position-once
  "frame-id - `long`
  position - `int`"
  ([^Nd4jCpu$FlowPath this ^Long frame-id ^Integer position]
    (-> this (.setRewindPositionOnce frame-id position))))

(defn branch
  "node-id - `int`

  returns: `int`"
  (^Integer [^Nd4jCpu$FlowPath this ^Integer node-id]
    (-> this (.branch node-id))))

(defn profile
  "returns: `org.nd4j.nativeblas.Nd4jCpu$GraphProfile`"
  (^org.nd4j.nativeblas.Nd4jCpu$GraphProfile [^Nd4jCpu$FlowPath this]
    (-> this (.profile))))

(defn mark-executed
  "was-executed - `boolean`

  returns: `void markExecuted(int nodeId, @`"
  ([^Nd4jCpu$FlowPath this ^Boolean was-executed]
    (-> this (.markExecuted was-executed))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FlowPath`"
  (^org.nd4j.nativeblas.Nd4jCpu$FlowPath [^Nd4jCpu$FlowPath this ^Long position]
    (-> this (.position position))))

(defn mark-branch
  "node-id - `int`
  index - `int`"
  ([^Nd4jCpu$FlowPath this ^Integer node-id ^Integer index]
    (-> this (.markBranch node-id index))))

(defn get-number-of-cycles
  "frame-id - `long`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$FlowPath this ^Long frame-id]
    (-> this (.getNumberOfCycles frame-id))))

(defn set-rewind-position
  "frame-id - `long`
  position - `int`"
  ([^Nd4jCpu$FlowPath this ^Long frame-id ^Integer position]
    (-> this (.setRewindPosition frame-id position))))

(defn mark-node-active
  "is-active - `boolean`

  returns: `void markNodeActive(int nodeId, @`"
  ([^Nd4jCpu$FlowPath this ^Boolean is-active]
    (-> this (.markNodeActive is-active))))

(defn inner-time
  "node-id - `int`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$FlowPath this ^Integer node-id]
    (-> this (.innerTime node-id))))

(defn get-rewind-position
  "frame-id - `long`

  returns: `int`"
  (^Integer [^Nd4jCpu$FlowPath this ^Long frame-id]
    (-> this (.getRewindPosition frame-id))))

(defn register-frame
  "frame-id - `long`"
  ([^Nd4jCpu$FlowPath this ^Long frame-id]
    (-> this (.registerFrame frame-id))))

(defn increment-number-of-cycles
  "frame-id - `long`"
  ([^Nd4jCpu$FlowPath this ^Long frame-id]
    (-> this (.incrementNumberOfCycles frame-id))))

(defn was-executed
  "node-id - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FlowPath this ^Integer node-id]
    (-> this (.wasExecuted node-id))))

(defn is-rewind-planned
  "frame-id - `long`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$FlowPath this ^Long frame-id]
    (-> this (.isRewindPlanned frame-id))))

(defn mark-frame-active
  "is-active - `boolean`

  returns: `void markFrameActive((value="Nd4jLong") long frameId, @`"
  ([^Nd4jCpu$FlowPath this ^Boolean is-active]
    (-> this (.markFrameActive is-active))))

(defn plan-rewind
  "really-rewind - `boolean`

  returns: `void planRewind((value="Nd4jLong") long frameId, @`"
  ([^Nd4jCpu$FlowPath this ^Boolean really-rewind]
    (-> this (.planRewind really-rewind))))

