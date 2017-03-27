package test;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.vocabulary.RDF;
import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;

import junit.framework.TestCase;
import r2rml.engine.Configuration;
import r2rml.engine.R2RMLProcessor;

/**
 * Unit test for testing the functionality CSV to JDBC
 * in memory database.
 * 
 * @author Christophe Debruyne
 *
 */
public class TestR2RMLCOL extends TestCase {

	public TestR2RMLCOL(String testName) {
		super(testName);
	}

	@BeforeClass
	public static void init() throws Exception {
		// Log4J junit configuration.
		BasicConfigurator.configure();
	}

//	public void testExampleCSV01() {
//		Configuration configuration = new Configuration();
//		configuration.setMappingFile("./test/resources/COL01.mapping.ttl");
//		configuration.getCSVFiles().add("./test/resources/PERSON.CSV");
//		configuration.getCSVFiles().add("./test/resources/PET.CSV");
//		R2RMLProcessor engine = new R2RMLProcessor(configuration);
//		engine.execute();
//		Model model = engine.getDataset().getDefaultModel();
//		model.write(System.out, "Turtle");
//	}
//	
//	public void testExampleCSV02() {
//		Configuration configuration = new Configuration();
//		configuration.setMappingFile("./test/resources/COL02.mapping.ttl");
//		configuration.getCSVFiles().add("./test/resources/PERSON.CSV");
//		configuration.getCSVFiles().add("./test/resources/PET.CSV");
//		R2RMLProcessor engine = new R2RMLProcessor(configuration);
//		engine.execute();
//		Model model = engine.getDataset().getDefaultModel();
//		model.write(System.out, "Turtle");
//	}
	
	public void testExampleCSV04() {
		Configuration configuration = new Configuration();
		configuration.setMappingFile("./test/resources/COL04.mapping.ttl");
		configuration.getCSVFiles().add("./test/resources/COLAUTHOR.CSV");
		configuration.getCSVFiles().add("./test/resources/COLBOOK.CSV");
		R2RMLProcessor engine = new R2RMLProcessor(configuration);
		engine.execute();
		Model model = engine.getDataset().getDefaultModel();
		model.setNsPrefix("ex", "http://example.com/ns#");
		model.setNsPrefix("person", "http://example.com/person/");
		model.setNsPrefix("book", "http://example.com/book/");
		model.setNsPrefix("rdf", RDF.uri);
		model.write(System.out, "Turtle");
	}
	
	public void testExampleCSV05() {
		Configuration configuration = new Configuration();
		configuration.setMappingFile("./test/resources/COL05.mapping.ttl");
		configuration.getCSVFiles().add("./test/resources/COLAUTHOR.CSV");
		configuration.getCSVFiles().add("./test/resources/COLBOOK.CSV");
		R2RMLProcessor engine = new R2RMLProcessor(configuration);
		engine.execute();
		Model model = engine.getDataset().getDefaultModel();
		model.setNsPrefix("ex", "http://example.com/ns#");
		model.setNsPrefix("person", "http://example.com/person/");
		model.setNsPrefix("book", "http://example.com/book/");
		model.setNsPrefix("rdf", RDF.uri);
		model.write(System.out, "Turtle");
	}

}
