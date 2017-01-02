/**
 * 
 */
package com.dr.ezOrganise.persistance;

import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.dr.ezOrganise.model.SequenceId;

/**
 * @author divyarattan
 *
 */
public class SequenceGenerator {

	public static long getNextSequenceId(String key) {

		// get sequence id
		Query query = new Query(Criteria.where("_id").is(key));

		// increase sequence id by 1
		Update update = new Update();
		update.inc("seq", 1);

		// return new increased id
		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true);

		SequenceId seqId = MongoConnection.getMongoOperation().findAndModify(query, update, options, SequenceId.class);

		return seqId.getSeq();

	}

}
