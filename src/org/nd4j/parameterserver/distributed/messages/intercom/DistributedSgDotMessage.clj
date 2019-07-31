(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedSgDotMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedSgDotMessage]))

(defn ->distributed-sg-dot-message
  "Constructor.

  task-id - `long`
  rows-a - `int[]`
  rows-b - `int[]`
  w-1 - `int`
  w-2 - `int`
  codes - `byte[]`
  use-hs - `boolean`
  neg-samples - `short`
  alpha - `float`"
  (^DistributedSgDotMessage [^Long task-id rows-a rows-b ^Integer w-1 ^Integer w-2 codes ^Boolean use-hs ^Short neg-samples ^Float alpha]
    (new DistributedSgDotMessage task-id rows-a rows-b w-1 w-2 codes use-hs neg-samples alpha))
  (^DistributedSgDotMessage []
    (new DistributedSgDotMessage ))
  (^DistributedSgDotMessage [^Long task-id ^Integer row-a ^Integer row-b]
    (new DistributedSgDotMessage task-id row-a row-b)))

(defn process-message
  "This method calculates dot of gives rows"
  ([^DistributedSgDotMessage this]
    (-> this (.processMessage))))

