(ns org.deeplearning4j.spark.models.embeddings.word2vec.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.deeplearning4j.spark.models.embeddings.word2vec.FirstIterationFunction])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.FirstIterationFunctionAdapter])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.MapToPairFunction])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.NegativeHolder])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.SecondIterationFunction])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.SentenceBatch])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.VocabHolder])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec$Builder])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecChange])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecFuncCall])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecPerformer])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecPerformerVoid])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecSetup])
(require '[org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecVariables])