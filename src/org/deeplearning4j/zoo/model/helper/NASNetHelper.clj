(ns org.deeplearning4j.zoo.model.helper.NASNetHelper
  "Layer helpers NASNet."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model.helper NASNetHelper]))

(defn ->nas-net-helper
  "Constructor."
  (^NASNetHelper []
    (new NASNetHelper )))

(defn *sep-conv-block
  "graph-builder - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  filters - `int`
  kernel-size - `int`
  stride - `int`
  block-id - `java.lang.String`
  input - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph-builder ^Integer filters ^Integer kernel-size ^Integer stride ^java.lang.String block-id ^java.lang.String input]
    (NASNetHelper/sepConvBlock graph-builder filters kernel-size stride block-id input)))

(defn *adjust-block
  "graph-builder - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  filters - `int`
  block-id - `java.lang.String`
  input - `java.lang.String`
  input-to-match - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph-builder ^Integer filters ^java.lang.String block-id ^java.lang.String input ^java.lang.String input-to-match]
    (NASNetHelper/adjustBlock graph-builder filters block-id input input-to-match))
  (^java.lang.String [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph-builder ^Integer filters ^java.lang.String block-id ^java.lang.String input]
    (NASNetHelper/adjustBlock graph-builder filters block-id input)))

(defn *normal-a
  "graph-builder - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  filters - `int`
  block-id - `java.lang.String`
  input-x - `java.lang.String`
  input-p - `java.lang.String`

  returns: `org.nd4j.linalg.primitives.Pair<java.lang.String,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph-builder ^Integer filters ^java.lang.String block-id ^java.lang.String input-x ^java.lang.String input-p]
    (NASNetHelper/normalA graph-builder filters block-id input-x input-p)))

(defn *reduction-a
  "graph-builder - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  filters - `int`
  block-id - `java.lang.String`
  input-x - `java.lang.String`
  input-p - `java.lang.String`

  returns: `org.nd4j.linalg.primitives.Pair<java.lang.String,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph-builder ^Integer filters ^java.lang.String block-id ^java.lang.String input-x ^java.lang.String input-p]
    (NASNetHelper/reductionA graph-builder filters block-id input-x input-p)))

