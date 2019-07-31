(ns org.deeplearning4j.optimize.listeners.CollectScoresIterationListener
  "CollectScoresIterationListener simply stores the model scores internally (along with the iteration) every 1 or N
 iterations (this is configurable). These scores can then be obtained or exported."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners CollectScoresIterationListener]))

(defn ->collect-scores-iteration-listener
  "Constructor.

  Constructor for collecting scores with the specified frequency.

  frequency - Frequency with which to collect/save scores - `int`"
  (^CollectScoresIterationListener [^Integer frequency]
    (new CollectScoresIterationListener frequency))
  (^CollectScoresIterationListener []
    (new CollectScoresIterationListener )))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^CollectScoresIterationListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn get-score-vs-iter
  "returns: `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.Integer,java.lang.Double>>`"
  (^java.util.List [^CollectScoresIterationListener this]
    (-> this (.getScoreVsIter))))

(defn export-scores
  "Export the scores in delimited (one per line) UTF-8 format with the specified delimiter

  output-stream - Stream to write to - `java.io.OutputStream`
  delimiter - Delimiter to use - `java.lang.String`

  throws: java.io.IOException"
  ([^CollectScoresIterationListener this ^java.io.OutputStream output-stream ^java.lang.String delimiter]
    (-> this (.exportScores output-stream delimiter)))
  ([^CollectScoresIterationListener this ^java.io.OutputStream output-stream]
    (-> this (.exportScores output-stream))))

