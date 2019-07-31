(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedCbowDotMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedCbowDotMessage]))

(defn ->distributed-cbow-dot-message
  "Constructor.

  task-id - `long`
  rows-a - `int[]`
  rows-b - `int[]`
  w-1 - `int`
  codes - `byte[]`
  use-hs - `boolean`
  neg-samples - `short`
  alpha - `float`"
  (^DistributedCbowDotMessage [^Long task-id rows-a rows-b ^Integer w-1 codes ^Boolean use-hs ^Short neg-samples ^Float alpha]
    (new DistributedCbowDotMessage task-id rows-a rows-b w-1 codes use-hs neg-samples alpha))
  (^DistributedCbowDotMessage []
    (new DistributedCbowDotMessage ))
  (^DistributedCbowDotMessage [^Long task-id ^Integer row-a ^Integer row-b]
    (new DistributedCbowDotMessage task-id row-a row-b)))

(defn process-message
  "This method calculates dot of gives rows, with averaging applied to rowsA, as required by CBoW"
  ([^DistributedCbowDotMessage this]
    (-> this (.processMessage))))

