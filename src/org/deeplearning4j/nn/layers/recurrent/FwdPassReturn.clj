(ns org.deeplearning4j.nn.layers.recurrent.FwdPassReturn
  "Created by benny on 12/31/15."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent FwdPassReturn]))

(defn ->fwd-pass-return
  "Constructor."
  (^FwdPassReturn []
    (new FwdPassReturn )))

(defn fwd-pass-output
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FwdPassReturn this]
    (-> this .-fwdPassOutput)))

(defn fwd-pass-output-as-arrays
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-fwdPassOutputAsArrays)))

(defn mem-cell-state
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-memCellState)))

(defn mem-cell-activations
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-memCellActivations)))

(defn iz
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-iz)))

(defn ia
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-ia)))

(defn fa
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-fa)))

(defn oa
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-oa)))

(defn ga
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-ga)))

(defn fz
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-fz)))

(defn oz
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-oz)))

(defn gz
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray[]"
  ([^FwdPassReturn this]
    (-> this .-gz)))

(defn last-act
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FwdPassReturn this]
    (-> this .-lastAct)))

(defn last-mem-cell
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FwdPassReturn this]
    (-> this .-lastMemCell)))

(defn prev-act
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FwdPassReturn this]
    (-> this .-prevAct)))

(defn prev-mem-cell
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FwdPassReturn this]
    (-> this .-prevMemCell)))

(defn leverage-to
  "This method is OPTIONAL, and written mostly for future use

  id - `java.lang.String`"
  ([^FwdPassReturn this ^java.lang.String id]
    (-> this (.leverageTo id))))

