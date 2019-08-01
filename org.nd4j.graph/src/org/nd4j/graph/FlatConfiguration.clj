(ns org.nd4j.graph.FlatConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph FlatConfiguration]))

(defn ->flat-configuration
  "Constructor."
  (^FlatConfiguration []
    (new FlatConfiguration )))

(defn *add-footprint-forward
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  footprint-forward - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long footprint-forward]
    (FlatConfiguration/addFootprintForward builder footprint-forward)))

(defn *add-execution-mode
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  execution-mode - `byte`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Byte execution-mode]
    (FlatConfiguration/addExecutionMode builder execution-mode)))

(defn *add-profiling-mode
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  profiling-mode - `byte`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Byte profiling-mode]
    (FlatConfiguration/addProfilingMode builder profiling-mode)))

(defn *add-footprint-backward
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  footprint-backward - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long footprint-backward]
    (FlatConfiguration/addFootprintBackward builder footprint-backward)))

(defn *create-flat-configuration
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `long`
  execution-mode - `byte`
  profiling-mode - `byte`
  output-mode - `byte`
  timestats - `boolean`
  footprint-forward - `long`
  footprint-backward - `long`
  direction - `byte`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Long id ^Byte execution-mode ^Byte profiling-mode ^Byte output-mode ^Boolean timestats ^Long footprint-forward ^Long footprint-backward ^Byte direction]
    (FlatConfiguration/createFlatConfiguration builder id execution-mode profiling-mode output-mode timestats footprint-forward footprint-backward direction)))

(defn *add-output-mode
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  output-mode - `byte`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Byte output-mode]
    (FlatConfiguration/addOutputMode builder output-mode)))

(defn *end-flat-configuration
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatConfiguration/endFlatConfiguration builder)))

(defn *add-id
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long id]
    (FlatConfiguration/addId builder id)))

(defn *add-direction
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  direction - `byte`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Byte direction]
    (FlatConfiguration/addDirection builder direction)))

(defn *finish-flat-configuration-buffer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer offset]
    (FlatConfiguration/finishFlatConfigurationBuffer builder offset)))

(defn *get-root-as-flat-configuration
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.FlatConfiguration`

  returns: `org.nd4j.graph.FlatConfiguration`"
  (^org.nd4j.graph.FlatConfiguration [^java.nio.ByteBuffer bb ^org.nd4j.graph.FlatConfiguration obj]
    (FlatConfiguration/getRootAsFlatConfiguration bb obj))
  (^org.nd4j.graph.FlatConfiguration [^java.nio.ByteBuffer bb]
    (FlatConfiguration/getRootAsFlatConfiguration bb)))

(defn *start-flat-configuration
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatConfiguration/startFlatConfiguration builder)))

(defn *add-timestats
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  timestats - `boolean`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Boolean timestats]
    (FlatConfiguration/addTimestats builder timestats)))

(defn output-mode
  "returns: `byte`"
  (^Byte [^FlatConfiguration this]
    (-> this (.outputMode))))

(defn footprint-backward
  "returns: `long`"
  (^Long [^FlatConfiguration this]
    (-> this (.footprintBackward))))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^FlatConfiguration this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn id
  "returns: `long`"
  (^Long [^FlatConfiguration this]
    (-> this (.id))))

(defn execution-mode
  "returns: `byte`"
  (^Byte [^FlatConfiguration this]
    (-> this (.executionMode))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.FlatConfiguration`"
  (^org.nd4j.graph.FlatConfiguration [^FlatConfiguration this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn profiling-mode
  "returns: `byte`"
  (^Byte [^FlatConfiguration this]
    (-> this (.profilingMode))))

(defn direction
  "returns: `byte`"
  (^Byte [^FlatConfiguration this]
    (-> this (.direction))))

(defn footprint-forward
  "returns: `long`"
  (^Long [^FlatConfiguration this]
    (-> this (.footprintForward))))

(defn timestats
  "returns: `boolean`"
  (^Boolean [^FlatConfiguration this]
    (-> this (.timestats))))

