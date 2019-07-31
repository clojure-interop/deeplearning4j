(ns org.deeplearning4j.earlystopping.termination.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.deeplearning4j.earlystopping.termination.BestScoreEpochTerminationCondition])
(require '[org.deeplearning4j.earlystopping.termination.EpochTerminationCondition])
(require '[org.deeplearning4j.earlystopping.termination.InvalidScoreIterationTerminationCondition])
(require '[org.deeplearning4j.earlystopping.termination.IterationTerminationCondition])
(require '[org.deeplearning4j.earlystopping.termination.MaxEpochsTerminationCondition])
(require '[org.deeplearning4j.earlystopping.termination.MaxScoreIterationTerminationCondition])
(require '[org.deeplearning4j.earlystopping.termination.MaxTimeIterationTerminationCondition])
(require '[org.deeplearning4j.earlystopping.termination.ScoreImprovementEpochTerminationCondition])
