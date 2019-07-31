(ns org.deeplearning4j.nn.conf.layers.samediff.SDVertexParams
  "SDVertexParams is used to define the inputs - and the parameters - for a SameDiff layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SDVertexParams]))

(defn ->sd-vertex-params
  "Constructor."
  (^SDVertexParams []
    (new SDVertexParams )))

(defn define-inputs
  "Define the inputs to the DL4J SameDiff Vertex with specific names

  input-names - Names of the inputs. Number here also defines the number of vertex inputs - `java.lang.String`"
  ([^SDVertexParams this ^java.lang.String input-names]
    (-> this (.defineInputs input-names))))

