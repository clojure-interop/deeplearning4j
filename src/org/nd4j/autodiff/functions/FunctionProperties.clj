(ns org.nd4j.autodiff.functions.FunctionProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.functions FunctionProperties]))

(defn ->function-properties
  "Constructor."
  (^FunctionProperties []
    (new FunctionProperties )))

(defn *from-flat-properties
  "This method creates new FunctionProperties instance from FlatBuffers representation

  properties - `org.nd4j.graph.FlatProperties`

  returns: `org.nd4j.autodiff.functions.FunctionProperties`"
  (^org.nd4j.autodiff.functions.FunctionProperties [^org.nd4j.graph.FlatProperties properties]
    (FunctionProperties/fromFlatProperties properties)))

(defn *as-flat-properties
  "This method converts multiple FunctionProperties to FlatBuffers representation

  buffer-builder - `com.google.flatbuffers.FlatBufferBuilder`
  properties - `java.util.Collection`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder buffer-builder ^java.util.Collection properties]
    (FunctionProperties/asFlatProperties buffer-builder properties)))

(defn as-flat-properties
  "This method converts this FunctionProperties instance to FlatBuffers representation

  buffer-builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^FunctionProperties this ^com.google.flatbuffers.FlatBufferBuilder buffer-builder]
    (-> this (.asFlatProperties buffer-builder))))

