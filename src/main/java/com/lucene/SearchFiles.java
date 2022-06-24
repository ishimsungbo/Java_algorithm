package com.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.nio.file.Paths;

/**
 * 인덱싱 된 데이터를 검색해본다.
 *
 * 첫 번째 변수는 앞 프로그램에서 생성한 index 디렉터리를 가르킨다.
 * 두 번째는 검색하려고 하는 필드를 가리킨다.
 */

public class SearchFiles {

    public static final String INDEX_DIRECTORY = "index";
    public static final String FILED_CONTENTS = "contents";

    public static void main(String[] args) throws Exception{
        IndexReader reader = DirectoryReader.open(FSDirectory.open(Paths.get(INDEX_DIRECTORY)));
        IndexSearcher indexSearcher = new IndexSearcher(reader);

        Analyzer analyzer = new StandardAnalyzer();
        QueryParser queryParser = new QueryParser(FILED_CONTENTS, analyzer);
        String searchString = "over-full AND persuasion";
        Query query = queryParser.parse(searchString);

        TopDocs results = indexSearcher.search(query, 5);
        ScoreDoc[] hits = results.scoreDocs;

        //int numTotalHits = results.totalHits;
        System.out.println(results.totalHits  + " total matching documents [" + hits.length +"]");

        for(int i=0; i <hits.length;i++){
            int docId = hits[i].doc;
            Document d = indexSearcher.doc(docId);
            System.out.println((i+1) + " . "  + d.get("path") + " score=" + hits[i].score + "   " + d.getFields().size());
            for(int j=0; j < d.getFields().size() ;j++){
                System.out.println("==> "+ d.getFields());
            }
        }



        System.out.println("끝");
    }

}
