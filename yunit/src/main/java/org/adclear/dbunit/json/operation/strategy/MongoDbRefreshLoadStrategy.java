package org.adclear.dbunit.json.operation.strategy;

import org.adclear.dbunit.json.operation.MongoOperation;
import org.dbunit.operation.DatabaseOperation;

/**
 * @author fit
 *
 */
public class MongoDbRefreshLoadStrategy extends MongoBaseDataSetLoadStrategy {
	@Override
	public DatabaseOperation getLoadOperation() {
		return MongoOperation.REFRESH;
	}
}
