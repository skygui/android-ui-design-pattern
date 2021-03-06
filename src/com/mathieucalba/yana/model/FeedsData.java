package com.mathieucalba.yana.model;

import java.util.HashSet;
import java.util.Set;

import android.content.Context;

import com.mathieucalba.yana.R;


public class FeedsData {

	public static final class FEED_IDS {
		public static final int NEWS = 1;
		public static final int BRIEF = 2;
		public static final int TEST = 3;
		public static final int REPORT = 4;
	}

	public static class Feed {
		public final int id;
		public final String name;

		public Feed(int anId, String aName) {
			super();

			id = anId;
			name = aName;
		}
	}

	public static final Set<Feed> getFeeds() {
		final Set<Feed> feeds = new HashSet<FeedsData.Feed>(4);

		feeds.add(new Feed(FEED_IDS.NEWS, "News"));
		feeds.add(new Feed(FEED_IDS.BRIEF, "Briefs"));
		feeds.add(new Feed(FEED_IDS.TEST, "Tests"));
		feeds.add(new Feed(FEED_IDS.REPORT, "Reports"));

		return feeds;
	}

	public static final class CATEGORY_IDS {
		public static final int MOBILE = 1;
		public static final int HARDWARE = 2;
		public static final int BUSINESS = 3;
		public static final int GOOGLE = 4;
		public static final int APPLE = 5;
		public static final int MICROSOFT = 6;
	}

	public static class Category {
		public final int id;
		public final String name;

		public Category(int anId, String aName) {
			super();

			id = anId;
			name = aName;
		}
	}

	public static final Set<Category> getCategories() {
		final Set<Category> categories = new HashSet<FeedsData.Category>(7);

		categories.add(new Category(CATEGORY_IDS.MOBILE, "News"));
		categories.add(new Category(CATEGORY_IDS.HARDWARE, "Hardware"));
		categories.add(new Category(CATEGORY_IDS.BUSINESS, "Business"));
		categories.add(new Category(CATEGORY_IDS.GOOGLE, "Google"));
		categories.add(new Category(CATEGORY_IDS.APPLE, "Apple"));
		categories.add(new Category(CATEGORY_IDS.MICROSOFT, "Microsoft"));

		return categories;
	}

	public static class Article {
		public final int id;
		public final String title;
		public final String imageUrl;
		public final String htmlContent;
		public final String header;
		public final String author;
		public final int feedId;
		public final int categoryId;
		public final long timestamp;

		public Article(int anId, String aTitle, String anImageUrl, String aHtmlContent, String aHeader, String anAuthor, int aFeedId, int aCategoryId,
				long aTimestamp) {
			super();

			id = anId;
			title = aTitle;
			imageUrl = anImageUrl;
			htmlContent = aHtmlContent;
			header = aHeader;
			author = anAuthor;
			feedId = aFeedId;
			categoryId = aCategoryId;
			timestamp = aTimestamp;
		}
	}

	public static final Set<Article> getArticles(Context ctx) {
		final Set<Article> articles = new HashSet<FeedsData.Article>(7);

		articles.add(new Article(1, ctx.getString(R.string.title1), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359230878));
		articles.add(new Article(2, ctx.getString(R.string.title2), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359229878));
		articles.add(new Article(3, ctx.getString(R.string.title3), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359228878));
		articles.add(new Article(4, ctx.getString(R.string.title4), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359227878));
		articles.add(new Article(5, ctx.getString(R.string.title5), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359226878));
		articles.add(new Article(6, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359225878));
		articles.add(new Article(7, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359224878));
		articles.add(new Article(8, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359223878));
		articles.add(new Article(9, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.APPLE, 1359222878));
		articles.add(new Article(10, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.BUSINESS, 1359221878));
		articles.add(new Article(11, ctx.getString(R.string.title10), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.BUSINESS, 1359220878));
		articles.add(new Article(12, ctx.getString(R.string.title11), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.BUSINESS, 1359219878));
		articles.add(new Article(13, ctx.getString(R.string.title12), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.BUSINESS, 1359218878));
		articles.add(new Article(14, ctx.getString(R.string.title13), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.BUSINESS, 1359217878));
		articles.add(new Article(15, ctx.getString(R.string.title14), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359216878));
		articles.add(new Article(16, ctx.getString(R.string.title15), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359215878));
		articles.add(new Article(17, ctx.getString(R.string.title16), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359214878));
		articles.add(new Article(18, ctx.getString(R.string.title17), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359213878));
		articles.add(new Article(19, ctx.getString(R.string.title18), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359212878));
		articles.add(new Article(20, ctx.getString(R.string.title19), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359211878));
		articles.add(new Article(21, ctx.getString(R.string.title20), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359210878));
		articles.add(new Article(22, ctx.getString(R.string.title1), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359209878));
		articles.add(new Article(23, ctx.getString(R.string.title2), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.GOOGLE, 1359208878));
		articles.add(new Article(24, ctx.getString(R.string.title3), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359207878));
		articles.add(new Article(25, ctx.getString(R.string.title4), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359206878));
		articles.add(new Article(26, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359205878));
		articles.add(new Article(27, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359204878));
		articles.add(new Article(28, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359203878));
		articles.add(new Article(29, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359202878));
		articles.add(new Article(30, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MICROSOFT, 1359201878));
		articles.add(new Article(31, ctx.getString(R.string.title10), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MICROSOFT, 1359200878));
		articles.add(new Article(32, ctx.getString(R.string.title11), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MICROSOFT, 1359199878));
		articles.add(new Article(33, ctx.getString(R.string.title12), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MICROSOFT, 1359198878));
		articles.add(new Article(34, ctx.getString(R.string.title13), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MICROSOFT, 1359197878));
		articles.add(new Article(35, ctx.getString(R.string.title14), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MICROSOFT, 1359196878));
		articles.add(new Article(36, ctx.getString(R.string.title15), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359195878));
		articles.add(new Article(37, ctx.getString(R.string.title16), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359194878));
		articles.add(new Article(38, ctx.getString(R.string.title17), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359193878));
		articles.add(new Article(39, ctx.getString(R.string.title18), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.HARDWARE, 1359192878));
		articles.add(new Article(40, ctx.getString(R.string.title19), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359191878));
		articles.add(new Article(41, ctx.getString(R.string.title20), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359190878));
		articles.add(new Article(42, ctx.getString(R.string.title1), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359189878));
		articles.add(new Article(43, ctx.getString(R.string.title2), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359188878));
		articles.add(new Article(44, ctx.getString(R.string.title3), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359187878));
		articles.add(new Article(45, ctx.getString(R.string.title4), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359186878));
		articles.add(new Article(46, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359185878));
		articles.add(new Article(47, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359184878));
		articles.add(new Article(48, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359183878));
		articles.add(new Article(49, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359182878));
		articles.add(new Article(50, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.NEWS, CATEGORY_IDS.MOBILE, 1359181878));
		articles.add(new Article(51, ctx.getString(R.string.title1), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359230878));
		articles.add(new Article(52, ctx.getString(R.string.title2), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359229878));
		articles.add(new Article(53, ctx.getString(R.string.title3), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359228878));
		articles.add(new Article(54, ctx.getString(R.string.title4), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359227878));
		articles.add(new Article(55, ctx.getString(R.string.title5), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359226878));
		articles.add(new Article(56, ctx.getString(R.string.title5), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359225878));
		articles.add(new Article(57, ctx.getString(R.string.title6), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359224878));
		articles.add(new Article(58, ctx.getString(R.string.title7), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359223878));
		articles.add(new Article(59, ctx.getString(R.string.title8), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.APPLE, 1359222878));
		articles.add(new Article(60, ctx.getString(R.string.title9), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.BUSINESS, 1359221878));
		articles.add(new Article(61, ctx.getString(R.string.title10), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.BUSINESS, 1359220878));
		articles.add(new Article(62, ctx.getString(R.string.title11), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.BUSINESS, 1359219878));
		articles.add(new Article(63, ctx.getString(R.string.title12), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.BUSINESS, 1359218878));
		articles.add(new Article(64, ctx.getString(R.string.title13), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.BUSINESS, 1359217878));
		articles.add(new Article(65, ctx.getString(R.string.title14), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359216878));
		articles.add(new Article(66, ctx.getString(R.string.title15), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359215878));
		articles.add(new Article(67, ctx.getString(R.string.title16), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359214878));
		articles.add(new Article(68, ctx.getString(R.string.title17), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359213878));
		articles.add(new Article(69, ctx.getString(R.string.title18), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359212878));
		articles.add(new Article(70, ctx.getString(R.string.title19), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359211878));
		articles.add(new Article(71, ctx.getString(R.string.title20), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359210878));
		articles.add(new Article(72, ctx.getString(R.string.title1), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359209878));
		articles.add(new Article(73, ctx.getString(R.string.title2), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.GOOGLE, 1359208878));
		articles.add(new Article(74, ctx.getString(R.string.title3), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359207878));
		articles.add(new Article(75, ctx.getString(R.string.title4), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359206878));
		articles.add(new Article(76, ctx.getString(R.string.title5), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359205878));
		articles.add(new Article(77, ctx.getString(R.string.title6), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359204878));
		articles.add(new Article(78, ctx.getString(R.string.title7), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359203878));
		articles.add(new Article(79, ctx.getString(R.string.title8), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359202878));
		articles.add(new Article(80, ctx.getString(R.string.title9), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MICROSOFT, 1359201878));
		articles.add(new Article(81, ctx.getString(R.string.title10), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MICROSOFT, 1359200878));
		articles.add(new Article(82, ctx.getString(R.string.title11), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MICROSOFT, 1359199878));
		articles.add(new Article(83, ctx.getString(R.string.title12), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MICROSOFT, 1359198878));
		articles.add(new Article(84, ctx.getString(R.string.title13), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MICROSOFT, 1359197878));
		articles.add(new Article(85, ctx.getString(R.string.title14), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MICROSOFT, 1359196878));
		articles.add(new Article(86, ctx.getString(R.string.title15), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359195878));
		articles.add(new Article(87, ctx.getString(R.string.title16), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359194878));
		articles.add(new Article(88, ctx.getString(R.string.title17), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359193878));
		articles.add(new Article(89, ctx.getString(R.string.title18), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.HARDWARE, 1359192878));
		articles.add(new Article(90, ctx.getString(R.string.title19), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359191878));
		articles.add(new Article(91, ctx.getString(R.string.title20), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359190878));
		articles.add(new Article(92, ctx.getString(R.string.title1), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359189878));
		articles.add(new Article(93, ctx.getString(R.string.title2), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359188878));
		articles.add(new Article(94, ctx.getString(R.string.title3), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359187878));
		articles.add(new Article(95, ctx.getString(R.string.title4), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359186878));
		articles.add(new Article(96, ctx.getString(R.string.title5), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359185878));
		articles.add(new Article(97, ctx.getString(R.string.title6), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359184878));
		articles.add(new Article(98, ctx.getString(R.string.title7), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359183878));
		articles.add(new Article(99, ctx.getString(R.string.title8), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359182878));
		articles.add(new Article(100, ctx.getString(R.string.title9), null, null, null, null, FEED_IDS.BRIEF, CATEGORY_IDS.MOBILE, 1359181878));
		articles.add(new Article(101, ctx.getString(R.string.title1), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359230878));
		articles.add(new Article(102, ctx.getString(R.string.title2), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359229878));
		articles.add(new Article(103, ctx.getString(R.string.title3), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359228878));
		articles.add(new Article(104, ctx.getString(R.string.title4), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359227878));
		articles.add(new Article(105, ctx.getString(R.string.title5), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359226878));
		articles.add(new Article(106, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359225878));
		articles.add(new Article(107, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359224878));
		articles.add(new Article(108, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359223878));
		articles.add(new Article(109, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.APPLE, 1359222878));
		articles.add(new Article(110, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.BUSINESS, 1359221878));
		articles.add(new Article(111, ctx.getString(R.string.title10), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.BUSINESS, 1359220878));
		articles.add(new Article(112, ctx.getString(R.string.title11), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.BUSINESS, 1359219878));
		articles.add(new Article(113, ctx.getString(R.string.title12), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.BUSINESS, 1359218878));
		articles.add(new Article(114, ctx.getString(R.string.title13), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.BUSINESS, 1359217878));
		articles.add(new Article(115, ctx.getString(R.string.title14), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359216878));
		articles.add(new Article(116, ctx.getString(R.string.title15), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359215878));
		articles.add(new Article(117, ctx.getString(R.string.title16), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359214878));
		articles.add(new Article(118, ctx.getString(R.string.title17), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359213878));
		articles.add(new Article(119, ctx.getString(R.string.title18), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359212878));
		articles.add(new Article(120, ctx.getString(R.string.title19), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359211878));
		articles.add(new Article(121, ctx.getString(R.string.title20), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359210878));
		articles.add(new Article(122, ctx.getString(R.string.title1), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359209878));
		articles.add(new Article(123, ctx.getString(R.string.title2), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.GOOGLE, 1359208878));
		articles.add(new Article(124, ctx.getString(R.string.title3), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359207878));
		articles.add(new Article(125, ctx.getString(R.string.title4), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359206878));
		articles.add(new Article(126, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359205878));
		articles.add(new Article(127, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359204878));
		articles.add(new Article(128, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359203878));
		articles.add(new Article(129, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359202878));
		articles.add(new Article(130, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MICROSOFT, 1359201878));
		articles.add(new Article(131, ctx.getString(R.string.title10), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MICROSOFT, 1359200878));
		articles.add(new Article(132, ctx.getString(R.string.title11), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MICROSOFT, 1359199878));
		articles.add(new Article(133, ctx.getString(R.string.title12), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MICROSOFT, 1359198878));
		articles.add(new Article(134, ctx.getString(R.string.title13), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MICROSOFT, 1359197878));
		articles.add(new Article(135, ctx.getString(R.string.title14), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MICROSOFT, 1359196878));
		articles.add(new Article(136, ctx.getString(R.string.title15), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359195878));
		articles.add(new Article(137, ctx.getString(R.string.title16), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359194878));
		articles.add(new Article(138, ctx.getString(R.string.title17), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359193878));
		articles.add(new Article(139, ctx.getString(R.string.title18), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.HARDWARE, 1359192878));
		articles.add(new Article(140, ctx.getString(R.string.title19), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359191878));
		articles.add(new Article(141, ctx.getString(R.string.title20), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359190878));
		articles.add(new Article(142, ctx.getString(R.string.title1), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359189878));
		articles.add(new Article(143, ctx.getString(R.string.title2), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359188878));
		articles.add(new Article(144, ctx.getString(R.string.title3), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359187878));
		articles.add(new Article(145, ctx.getString(R.string.title4), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359186878));
		articles.add(new Article(146, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359185878));
		articles.add(new Article(147, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359184878));
		articles.add(new Article(148, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359183878));
		articles.add(new Article(149, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359182878));
		articles.add(new Article(150, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.TEST, CATEGORY_IDS.MOBILE, 1359181878));
		articles.add(new Article(151, ctx.getString(R.string.title1), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359230878));
		articles.add(new Article(152, ctx.getString(R.string.title2), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359229878));
		articles.add(new Article(153, ctx.getString(R.string.title3), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359228878));
		articles.add(new Article(154, ctx.getString(R.string.title4), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359227878));
		articles.add(new Article(155, ctx.getString(R.string.title5), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359226878));
		articles.add(new Article(156, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359225878));
		articles.add(new Article(157, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359224878));
		articles.add(new Article(158, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359223878));
		articles.add(new Article(159, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.APPLE, 1359222878));
		articles.add(new Article(160, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.BUSINESS, 1359221878));
		articles.add(new Article(161, ctx.getString(R.string.title10), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.BUSINESS, 1359220878));
		articles.add(new Article(162, ctx.getString(R.string.title11), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.BUSINESS, 1359219878));
		articles.add(new Article(163, ctx.getString(R.string.title12), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.BUSINESS, 1359218878));
		articles.add(new Article(164, ctx.getString(R.string.title13), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.BUSINESS, 1359217878));
		articles.add(new Article(165, ctx.getString(R.string.title14), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359216878));
		articles.add(new Article(166, ctx.getString(R.string.title15), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359215878));
		articles.add(new Article(167, ctx.getString(R.string.title16), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359214878));
		articles.add(new Article(168, ctx.getString(R.string.title17), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359213878));
		articles.add(new Article(169, ctx.getString(R.string.title18), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359212878));
		articles.add(new Article(170, ctx.getString(R.string.title19), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359211878));
		articles.add(new Article(171, ctx.getString(R.string.title20), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359210878));
		articles.add(new Article(172, ctx.getString(R.string.title1), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359209878));
		articles.add(new Article(173, ctx.getString(R.string.title2), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.GOOGLE, 1359208878));
		articles.add(new Article(174, ctx.getString(R.string.title3), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359207878));
		articles.add(new Article(175, ctx.getString(R.string.title4), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359206878));
		articles.add(new Article(176, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359205878));
		articles.add(new Article(177, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359204878));
		articles.add(new Article(178, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359203878));
		articles.add(new Article(179, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359202878));
		articles.add(new Article(180, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MICROSOFT, 1359201878));
		articles.add(new Article(181, ctx.getString(R.string.title10), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MICROSOFT, 1359200878));
		articles.add(new Article(182, ctx.getString(R.string.title11), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MICROSOFT, 1359199878));
		articles.add(new Article(183, ctx.getString(R.string.title12), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MICROSOFT, 1359198878));
		articles.add(new Article(184, ctx.getString(R.string.title13), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MICROSOFT, 1359197878));
		articles.add(new Article(185, ctx.getString(R.string.title14), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MICROSOFT, 1359196878));
		articles.add(new Article(186, ctx.getString(R.string.title15), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359195878));
		articles.add(new Article(187, ctx.getString(R.string.title16), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359194878));
		articles.add(new Article(188, ctx.getString(R.string.title17), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359193878));
		articles.add(new Article(189, ctx.getString(R.string.title18), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.HARDWARE, 1359192878));
		articles.add(new Article(190, ctx.getString(R.string.title19), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359191878));
		articles.add(new Article(191, ctx.getString(R.string.title20), ctx.getString(R.string.image_url1), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359190878));
		articles.add(new Article(192, ctx.getString(R.string.title1), ctx.getString(R.string.image_url2), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359189878));
		articles.add(new Article(193, ctx.getString(R.string.title2), ctx.getString(R.string.image_url3), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359188878));
		articles.add(new Article(194, ctx.getString(R.string.title3), ctx.getString(R.string.image_url4), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359187878));
		articles.add(new Article(195, ctx.getString(R.string.title4), ctx.getString(R.string.image_url5), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359186878));
		articles.add(new Article(196, ctx.getString(R.string.title5), ctx.getString(R.string.image_url6), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359185878));
		articles.add(new Article(197, ctx.getString(R.string.title6), ctx.getString(R.string.image_url7), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359184878));
		articles.add(new Article(198, ctx.getString(R.string.title7), ctx.getString(R.string.image_url8), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359183878));
		articles.add(new Article(199, ctx.getString(R.string.title8), ctx.getString(R.string.image_url9), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359182878));
		articles.add(new Article(200, ctx.getString(R.string.title9), ctx.getString(R.string.image_url10), ctx.getString(R.string.html_content), ctx
				.getString(R.string.header), ctx.getString(R.string.author), FEED_IDS.REPORT, CATEGORY_IDS.MOBILE, 1359181878));

		return articles;
	}

}
