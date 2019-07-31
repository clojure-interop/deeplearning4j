(ns org.nd4j.parameterserver.distributed.logic.completion.Clipboard
  "Since VoidParameterServer assumes nearly endless asynchronous data flow, we'll use Clipboard approach to aggregate
 different batches of aggregates coming in un-ordered."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.completion Clipboard]))

(defn ->clipboard
  "Constructor."
  (^Clipboard []
    (new Clipboard )))

(defn tracking?
  "originator-id - `long`
  task-id - `long`

  returns: `boolean`"
  (^Boolean [^Clipboard this ^Long originator-id ^Long task-id]
    (-> this (.isTracking originator-id task-id))))

(defn has-candidates?
  "This method checks, if clipboard has ready aggregations available

  returns: TRUE, if there's at least 1 candidate ready, FALSE otherwise - `boolean`"
  (^Boolean [^Clipboard this]
    (-> this (.hasCandidates))))

(defn unpin
  "This method removes given VoidAggregation from clipboard, and returns it

  originator-id - `long`
  task-id - `long`

  returns: `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  (^org.nd4j.parameterserver.distributed.messages.VoidAggregation [^Clipboard this ^Long originator-id ^Long task-id]
    (-> this (.unpin originator-id task-id)))
  (^org.nd4j.parameterserver.distributed.messages.VoidAggregation [^Clipboard this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.unpin aggregation))))

(defn next-candidate
  "This method returns one of available aggregations, if there's at least 1 ready.

  returns: `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  (^org.nd4j.parameterserver.distributed.messages.VoidAggregation [^Clipboard this]
    (-> this (.nextCandidate))))

(defn get-number-of-pinned-stacks
  "returns: `int`"
  (^Integer [^Clipboard this]
    (-> this (.getNumberOfPinnedStacks))))

(defn get-stack-from-clipboard
  "originator-id - `long`
  task-id - `long`

  returns: `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  (^org.nd4j.parameterserver.distributed.messages.VoidAggregation [^Clipboard this ^Long originator-id ^Long task-id]
    (-> this (.getStackFromClipboard originator-id task-id))))

(defn get-number-of-complete-stacks
  "returns: `int`"
  (^Integer [^Clipboard this]
    (-> this (.getNumberOfCompleteStacks))))

(defn pin
  "This method places incoming VoidAggregation into clipboard, for further tracking

  aggregation - `org.nd4j.parameterserver.distributed.messages.VoidAggregation`

  returns: TRUE, if given VoidAggregation was the last chunk, FALSE otherwise - `boolean`"
  (^Boolean [^Clipboard this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.pin aggregation))))

(defn ready?
  "originator-id - `long`
  task-id - `long`

  returns: `boolean`"
  (^Boolean [^Clipboard this ^Long originator-id ^Long task-id]
    (-> this (.isReady originator-id task-id)))
  (^Boolean [^Clipboard this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.isReady aggregation))))

