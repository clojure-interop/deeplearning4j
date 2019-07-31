(ns org.nd4j.nativeblas.Nd4jCpu$GraphProfile
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
  (:import [org.nd4j.nativeblas Nd4jCpu$GraphProfile]))

(defn ->graph-profile
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$GraphProfile [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$GraphProfile p))
  (^Nd4jCpu$GraphProfile []
    (new Nd4jCpu$GraphProfile )))

(defn *current-time
  "These methods are just utility methods for time

  returns: `(value="Nd4jLong")   long`"
  ([]
    (Nd4jCpu$GraphProfile/currentTime )))

(defn *relative-time
  "time - `long`

  returns: `(value="Nd4jLong")   long`"
  ([^Long time]
    (Nd4jCpu$GraphProfile/relativeTime time)))

(defn assign
  "other - `org.nd4j.nativeblas.Nd4jCpu$GraphProfile`"
  ([^Nd4jCpu$GraphProfile this ^org.nd4j.nativeblas.Nd4jCpu$GraphProfile other]
    (-> this (.assign other))))

(defn node-by-id
  "This method returns pointer to NodeProfile by ID
  PLEASE NOTE: this method will create new NodeProfile if there's none

  name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCpu$NodeProfile nodeById(int id, @`"
  ([^Nd4jCpu$GraphProfile this ^java.lang.String name]
    (-> this (.nodeById name))))

(defn node-exists
  "id - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$GraphProfile this ^Integer id]
    (-> this (.nodeExists id))))

(defn start-event
  "name - `java.lang.String`"
  ([^Nd4jCpu$GraphProfile this ^java.lang.String name]
    (-> this (.startEvent name))))

(defn record-event
  "name - `java.lang.String`"
  ([^Nd4jCpu$GraphProfile this ^java.lang.String name]
    (-> this (.recordEvent name))))

(defn set-build-time
  "This method allows to set graph construction (i.e. deserialization) time in nanoseconds

  nanos - `long`"
  ([^Nd4jCpu$GraphProfile this ^Long nanos]
    (-> this (.setBuildTime nanos))))

(defn spot-event
  "This method saves time as delta from last saved time

  name - `java.lang.String`"
  ([^Nd4jCpu$GraphProfile this ^java.lang.String name]
    (-> this (.spotEvent name))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$GraphProfile`"
  (^org.nd4j.nativeblas.Nd4jCpu$GraphProfile [^Nd4jCpu$GraphProfile this ^Long position]
    (-> this (.position position))))

(defn print-out
  ""
  ([^Nd4jCpu$GraphProfile this]
    (-> this (.printOut))))

(defn add-to-temporary
  "bytes - `long`"
  ([^Nd4jCpu$GraphProfile this ^Long bytes]
    (-> this (.addToTemporary bytes))))

(defn set-execution-time
  "This method sets graph execution time in nanoseconds.

  nanos - `long`"
  ([^Nd4jCpu$GraphProfile this ^Long nanos]
    (-> this (.setExecutionTime nanos))))

(defn delete-event
  "name - `java.lang.String`"
  ([^Nd4jCpu$GraphProfile this ^java.lang.String name]
    (-> this (.deleteEvent name))))

(defn add-to-total
  "These methods just adding amount of bytes to various counters

  bytes - `long`"
  ([^Nd4jCpu$GraphProfile this ^Long bytes]
    (-> this (.addToTotal bytes))))

(defn add-to-activations
  "bytes - `long`"
  ([^Nd4jCpu$GraphProfile this ^Long bytes]
    (-> this (.addToActivations bytes))))

(defn add-to-objects
  "bytes - `long`"
  ([^Nd4jCpu$GraphProfile this ^Long bytes]
    (-> this (.addToObjects bytes))))

(defn merge
  "This method merges values from other profile report

  other - `org.nd4j.nativeblas.Nd4jCpu$GraphProfile`"
  ([^Nd4jCpu$GraphProfile this ^org.nd4j.nativeblas.Nd4jCpu$GraphProfile other]
    (-> this (.merge other))))

